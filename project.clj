(defproject website "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [lein-ring "0.7.5"]]
            :plugins [[lein-beanstalk "0.2.6"]
                      [lein-ring "0.7.5"]]
            :aws {:beanstalk
                  {:environments
                   [{
                     :name "beansite"
                     :cname-prefix "beansite"
                     :env {"BEANSTALK_ENV" "beansite"}}]}}
            :ring {:handler website.server/handler} ;; Check this works
            :main website.server)

