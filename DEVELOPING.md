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

## Publishing to Clojars

The template for the project's `pom.xml` lives at
[`template/pom.xml`](https://github.com/mentat-collective/mafs.cljs/blob/main/template/pom.xml).

To create a new release:

- Update the version in
  [build.clj](https://github.com/mentat-collective/mafs.cljs/blob/main/build.clj)
- Make a new [Github
  Release](https://github.com/mentat-collective/mafs.cljs/releases) with tag
  `v<the-new-version>`.

Submitting the release will create the new tag and trigger the following
command:

```
bb release
```

The new release will appear on Clojars.
