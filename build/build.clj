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
  (clerk/build! (-> opts
                    (assoc :paths ["notebooks/**"] :compile-css? true)
                    (assoc-in [:resource->url "/js/viewer.js"]
                              (clerk.viewer/store+get-cas-url! (assoc opts :ext "js")
                                                               (fs/read-all-bytes "public/build/viewer.js"))))))
