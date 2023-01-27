## Local Development

To test a template locally, run the following command from the directory
containing this folder, swapping in whatever template you'd like for the
`:template` key:

```
clojure -Sdeps '{:deps {io.github.nextjournal/clerk-cljs-demo {:local/root "./clerk-cljs-demo"}}}' \
  -Tnew create \
    :template clerk/notebook \
    :name myusername/mycoollib
```
