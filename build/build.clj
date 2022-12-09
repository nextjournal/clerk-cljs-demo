(ns build
  (:require [shadow.cljs.devtools.api :as shadow]
            [babashka.fs :as fs]
            [clojure.java.shell :refer [sh]]
            [nextjournal.clerk :as clerk]
            [nextjournal.clerk.config :as config]))

(defn build! [opts]
  (sh "yarn" "install")
  (shadow/release! :viewer)
  (let [cas
        (nextjournal.clerk.viewer/store+get-cas-url! {:out-path "public/build" :ext "js"}
                                                     (fs/read-all-bytes "public/build/viewer.js"))]
    (swap! config/!resource->url assoc "/js/viewer.js" cas)
    (clerk/build! (merge {:paths ["notebooks/**"]} opts))))
