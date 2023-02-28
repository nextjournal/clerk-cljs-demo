(ns clerk-cljs-demo.test-notebook
  (:require [nextjournal.clerk :as clerk]))

(clerk/with-viewer
 '(fn [_ _] [:h1 [:em.text-violet-400 clerk-cljs-demo.viewers-lib/header]]) nil)

;; and much more...
