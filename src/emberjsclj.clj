(ns emberjsclj
  (:require [noir.server :as server])
  (:require noir.core)
  (:require [noir.response :as response]
            [noir.session :as session]
            [noir.cookies :as cookies])
  (use noir.core
    hiccup.core hiccup.form-helpers
    hiccup.page-helpers)
  (:gen-class))

(server/load-views "src/views/")

(defn main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "6066"))]
    (server/start port {:mode mode
                        :ns 'emberjsclj})))
