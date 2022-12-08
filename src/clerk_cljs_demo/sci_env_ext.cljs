(ns clerk-cljs-demo.sci-env-ext
  (:require [nextjournal.clerk.sci-env :as sci-env]
            [sci.ctx-store]
            [sci.core :as sci]))

(def header "Clerk Custom CLJS")

(def extra-namespaces
  {:namespaces {'clerk-cljs.demo {'header header}}})

(sci.ctx-store/swap-ctx! sci/merge-opts extra-namespaces)
