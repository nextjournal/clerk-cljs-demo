# Clerk with custom CLJS Compilation Demo

## Usage

### Dev

Start shadow watcher

```
clojure -M:dev:shadow watch viewer
```

then jack-in with a REPL under the `:dev` alias to have a Clerk js env compiled from local files.

`user.clj` contains forms that will boot Clerk on startup.

### Release CLJS

```
clojure -X:shadow release viewer
```
