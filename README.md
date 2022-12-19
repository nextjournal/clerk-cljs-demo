# Clerk with custom CLJS Compilation Demo

This project documents best practices for a number of Clerk use cases.

- TODO add kondo config for clerk to template

## Usage

## Templates

To test the template locally, run the following command from the directory
containing this folder:

```
clojure -Sdeps '{:deps {io.github.nextjournal/clerk-cljs-demo {:local/root "./clerk-cljs-demo"}}}' \
  -Tnew create \
    :template clerk/notebook \
    :name myusername/mycoollib
```

Each `template.edn` has key-value pairs that you can override.

Relevant:

- `:port 1234`, for example, overrides the default port.

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
