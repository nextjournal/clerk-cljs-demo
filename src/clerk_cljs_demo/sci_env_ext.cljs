(ns clerk-cljs-demo.sci-env-ext
  (:require [nextjournal.clerk.sci-env]
            [sci.ctx-store]
            [clerk-cljs-demo.viewers-lib]
            [sci.core :as sci]))

(def extra-namespaces
  {:namespaces
   {'clerk-cljs-demo.viewers-lib
    (sci/copy-ns clerk-cljs-demo.viewers-lib
                 (sci/create-ns 'clerk-cljs-demo.viewers-lib))}})

(sci.ctx-store/swap-ctx! sci/merge-opts extra-namespaces)
