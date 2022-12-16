(ns user
  (:require [nextjournal.clerk :as clerk]))

(clerk/serve! {:port 7788 :browse? true})

(nextjournal.clerk/show! 'clerk-cljs-demo.test-notebook)
