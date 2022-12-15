(ns clerk-cljs-demo.sci-env-ext
  (:require [nextjournal.clerk.sci-env]
            [sci.ctx-store]
            [clerk-cljs-demo.viewers-lib]
            [sci.core :as sci]))

(defn CompiledSlider
  "Component that takes an atom with an integer and updates it with a slider."
  [!state]
  [:<>
   [:div
    [:input
     {:type :range :min 0 :max 10 :step 1
      :value @!state
      :on-change
      (fn [target]
        (let [v (.. target -target -value)]
          (reset! !state (js/parseInt v))))}]
    " " @!state]])

(def extra-namespaces
  {:namespaces
   {'demo {'CompiledSlider CompiledSlider}
    'clerk-cljs-demo.viewers-lib
    (sci/copy-ns clerk-cljs-demo.viewers-lib
                 (sci/create-ns 'clerk-cljs-demo.viewers-lib))}})

(sci.ctx-store/swap-ctx! sci/merge-opts extra-namespaces)
