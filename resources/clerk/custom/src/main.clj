;; # Welcome to Clerk!

(ns {{top/ns}}.{{main/ns}}
    (:require [nextjournal.clerk :as clerk]))

;; This is some Markdown.

(defn hello [s]
  (str "Hello, " s "!"))

(hello "Clerk")

;; ## Custom CLJS

(clerk/with-viewer
  {:transform-fn clerk/mark-presented
   :render-fn
   '(fn [m]
      [:pre (custom/helpful-square (:number m))])}
  {:number 10})
