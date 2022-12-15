(ns clerk-cljs-demo.test-notebook
  (:require [nextjournal.clerk :as clerk]))

^{::clerk/sync true}
(defonce !state
  (atom 4))

(clerk/with-viewer
  '(fn [_ _]
     (defn ClientSlider [!state]
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

     [:<>
      [:p "This cljs-defined slider will NOT update the server:"]
      [demo/CompiledSlider clerk-cljs-demo.test-notebook/!state]
      [:p "This sci-defined slider will successfully update the server:"]
      [ClientSlider clerk-cljs-demo.test-notebook/!state]])
  nil)

;; Server state:

@!state
