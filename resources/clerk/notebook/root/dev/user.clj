(ns user
  (:require [nextjournal.clerk :as clerk]))

(defn start!
  "TODO how to pass in other opts."
  [opts]
  (let [defaults {:port {{port}}
                  :browse? true}]
    (clerk/serve!
     (merge defaults opts))))
