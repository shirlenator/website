(ns website.views.welcome
  (:require [website.views.common :as common]
            [noir.content.getting-started]
            [noir.response :as resp])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to website"]))
(defpage "/" []
          (resp/redirect "/landing.html"))
