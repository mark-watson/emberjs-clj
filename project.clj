(defproject emberj-clj "0.1.0-SNAPSHOT"
  :description "Sample Ember.js and Clojure web app"
  :url "http://markwatson.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [clj-stacktrace "0.2.4"]
                 [org.clojure/data.json "0.2.1"]
                 [compojure "1.0.0-SNAPSHOT"]
                 [ring/ring-devel "1.0.0-RC4"]
                 [ring/ring-jetty-adapter "1.0.0-RC4"]
                 [ring/ring-servlet "1.0.0-RC4"]
                 [noir "1.2.2"]]
  :jvm-opts ["-Xmx320m"]
  :main emberjsclj/main)
