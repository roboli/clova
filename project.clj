(defproject clova "0.13.0"
  :description "A simple validation library for Clojure and ClojureScript."
  :url "http://github.com/markwoodhall/clova"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :codox {:namespaces [clova.core]
          :source-uri "https://github.com/markwoodhall/clova/blob/master/src/{classpath}#L{line}"}
  :dependencies [[org.clojure/clojure "1.7.0" :scope "provided"]
                 [org.clojure/clojurescript "1.7.170" :scope "provided"]]
  :jar-exclusions [#"\.swp|\.swo|user.clj"]
  :source-paths ["src"])
