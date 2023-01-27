(ns {{top/ns}}.sci
    (:require [nextjournal.clerk.sci-env]
              {{top/ns}}.custom
              [sci.ctx-store]
              [sci.core :as sci]))

;; ## SCI Customization

(def custom-namespaces
  {'{{top/ns}}.custom
   (sci/copy-ns {{top/ns}}.custom (sci/create-ns '{{top/ns}}.custom))
   ;; Add any more namespaces here! Make sure to `:require` anything you add at
   ;; the top.
   })

(def custom-aliases
  {'custom '{{top/ns}}.custom})

(sci.ctx-store/swap-ctx!
 sci/merge-opts
 {:classes    {'Math js/Math}
  :aliases    custom-aliases
  :namespaces custom-namespaces})
