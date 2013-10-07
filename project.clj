;; This project.clj is provided as a convenience for Leiningen users
;; The official core.matrix project configuration is in the pom.xml

(defproject net.mikera/core.matrix "0.10.0"
  :url "https://github.com/mikera/matrix-api"
  :license {:name "Eclipse Public License (EPL)"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/test/java"]
  :test-paths ["src/test/clojure" "src/test/java"]
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :marginalia {:javascript ["http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML"]}
  :profiles {:dev {:dependencies [[com.google.caliper/caliper "0.5-rc1"]
                                  [net.mikera/cljunit "0.2.0"]
                                  [criterium/criterium "0.4.1"]
                                  [hiccup "1.0.3"]
                                  [net.mikera/vectorz-clj "0.13.2"]
                                  [reiddraper/simple-check "0.3.0"]]
                   :source-paths ["src/main/clojure" "src/dev/clojure"]
                   :jvm-opts ^:replace []}})
