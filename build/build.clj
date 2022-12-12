(ns build
  (:require [shadow.cljs.devtools.api :as shadow]
            [babashka.fs :as fs]
            [clojure.java.shell :refer [sh]]
            [nextjournal.clerk :as clerk]
            [nextjournal.clerk.config :as config]))

(defn build! [opts]
  (sh "npm" "install")
  (shadow/release! :viewer)
  (let [js-resource-url
        (nextjournal.clerk.viewer/store+get-cas-url! (assoc opts :ext "js")
                                                     (fs/read-all-bytes "public/build/viewer.js"))]
    (swap! config/!resource->url assoc "/js/viewer.js" js-resource-url)
    (clerk/build! (merge {:paths ["notebooks/**"]} opts))))
