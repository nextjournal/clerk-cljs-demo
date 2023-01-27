# Clerk Templates

A collection of [deps-new][deps-new-url] templates that make it easy to get
started with [Clerk][clerk-url].

## Templates

This project defines the following templates:

- [`clerk/notebook`][notebook-template-url]: Basic template for writing
  notebooks with [Clerk][clerk-url]
- [`clerk/custom`][custom-template-url]: Template for a Clerk project that
  includes custom ClojureScript or uses external plugins

First, install [deps-new][deps-new-url]:

```sh
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.4.13"}' :as new
```

> **Note**
> If you don't have `clojure` installed, follow the instructions at
> [clojure.org][clojure-install-url].

To create a new notebook project based on
[`clerk/notebook`][notebook-template-url], run the following command:

```sh
clojure -Sdeps '{:deps {io.github.nextjournal/clerk-cljs-demo {:git/sha "b805370715fdcaf34f6a9d6cb2efc2b12153c90c"}}}' \
  -Tnew create \
    :template clerk/custom \
    :name myusername/notebooks
```

This will generate a project in the directory `notebooks`, with `myusername` as
the top-level namespace and `notebooks` as main namespace.

### Customizing Templates

Each template takes a number of options for customization! See each template's
directory (hyperlinked above) for a description of the customization options the
template accepts.

## License

Copyright © 2023 Nextjournal.

Distributed under the [MIT License](LICENSE). See [LICENSE](LICENSE).

[clojure-install-url]: https://clojure.org/guides/install_clojure
[clerk-url]: https://clerk.vision/
[deps-new-url]: https://github.com/seancorfield/deps-new
[custom-template-url]: https://github.com/nextjournal/clerk-cljs-demo/tree/main/resources/clerk/custom
[notebook-template-url]: https://github.com/nextjournal/clerk-cljs-demo/tree/main/resources/clerk/notebook
