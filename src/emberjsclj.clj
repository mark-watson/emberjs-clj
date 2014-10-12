(ns emberjsclj
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as ring]
            [compojure.route :as route]
            [clojure.data.json :as json]))

(def data [
            {"title" "Gazpacho"
             "ingredients" "Ingredients: 2 onions, 2 garlic cloves peeled and minced, 1 cup of chopped green pepper, 2 cups water, 2 teaspoons salt, 1/3 teaspoon black pepper, 1/3 cup red wine vinegar, 1 cup peeled and chopped cucumber, 5 tablespoons olive oil"
             "directions" "Combine the onions, garlic, green peppers and tomatoes. Force through a sieve or puree in a blender. Add the salt, pepper and paprika. Add the olive oil gradually, beating steadily. Add the vinegar and water and stir well. Season to taste. Refrigerate and chill for at least two hours"}
            {"title" "Balsamic Mushrooms"
             "directions" "Place all ingredients in a (preferably nonstick) pan and let sit for a few minutes. Then cook covered over medium heat for about three minutes until they are soft. Remove the cover and cook until the liquid is almost gone, then serve."
             "ingredients" "12 mushrooms, 1/4 cup balsamic vinegar, 1/8 cup red wine"}
            ])

(defn recipes-helper []
  (json/write-str data))

(def index-page (slurp "resources/public/index.html"))

;; the /recipes/ needs to return JSON data containing the recipes:

(defroutes routes
  (GET "/" [] index-page)
  (GET "/recipes/" [] (recipes-helper))
  (route/resources "/"))

(defn main []
  (ring/run-jetty #'routes {:port 6066 :join? false}))
