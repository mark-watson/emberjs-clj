(defproject emberj-clj "0.1.0-SNAPSHOT"
  :description "Sample Ember.js and Clojure web app"
  :url "http://markwatson.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]
                 [org.clojure/data.json "0.2.1"]]
  :jvm-opts ["-Xmx100m"]
  :main emberjsclj/main)

