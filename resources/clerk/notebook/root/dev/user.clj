(ns user
  (:require [nextjournal.clerk :as clerk]))

(defn start!
  "Starts a Clerk server process "
  ([] (start! {}))
  ([opts]
   (let [defaults {:port {{port}}
                   :browse? true}]
     (clerk/serve!
      (merge defaults opts)))))
