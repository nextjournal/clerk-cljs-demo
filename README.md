# Clerk with custom CLJS Compilation Demo

## Usage

### Dev

Start shadow watcher

```
clojure -M:shadow watch viewer
```

then jack-in with a REPL under the `:dev` alias to have a Clerk js env compiled from local files.

Start Clerk and show a notebook

```clojure
(nextjournal.clerk/serve {:port 7788 :browse? true})

(nextjournal.clerk/show! 'clerk-cljs-demo.test-notebook)
```

### Release CLJS

```
clojure -X:shadow release viewer
```
