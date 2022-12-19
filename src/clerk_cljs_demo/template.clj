(ns clerk-cljs-demo.template
  "Data and template functions for the deps-new templates.")

(defn data-fn
  "Example data-fn handler.

  Result is merged onto existing options data."
  [_data]
  ;; returning nil means no changes to options data
  (println "data-fn returning nil")
  nil)

(defn template-fn
  "Example template-fn handler.

  Result is used as the EDN for the template."
  [edn _data]
  ;; must return the whole EDN hash map
  (println "template-fn returning edn")
  edn)
