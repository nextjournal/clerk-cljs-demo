(ns build
  (:require
   [babashka.fs :as fs]
   [clojure.java.shell :refer [sh]]
   [nextjournal.clerk :as clerk]
   [nextjournal.clerk.viewer :as clerk.viewer]
   [shadow.cljs.devtools.api :as shadow]))

(defn build! [opts]
  (sh "npm" "install")
  (shadow/release! :viewer)
  (let [js-resource-url (clerk.viewer/store+get-cas-url! (assoc opts :ext "js")
                                                         (fs/read-all-bytes "public/build/viewer.js"))]
    (clerk/build! (-> opts
                      (assoc :paths ["notebooks/**"])
                      (update :resource->url assoc "/js/viewer.js" js-resource-url)))))
