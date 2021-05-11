(defproject severo-http-connector "1.0.1"
  :description "A http to kafka translator"
  :url "https://github.com/lsevero/severo-http-connector"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [cheshire "5.8.1"]
                 [yogthos/config "1.1.4"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [com.fasterxml.jackson.core/jackson-databind "2.12.3"]
                 [com.fasterxml.jackson.core/jackson-core "2.12.3"]
                 [metosin/reitit "0.5.13"
                  :exclusions [[com.fasterxml.jackson.core/jackson-core]
                               [com.fasterxml.jackson.core/jackson-databind]
                               ]]
                 [org.apache.kafka/kafka-clients "2.1.0"
                  :exclusions [[com.fasterxml.jackson.core/jackson-core]
                               [com.fasterxml.jackson.core/jackson-databind]
                               ]]
                 [borkdude/sci "0.2.5"]
                 [org.clojure/core.async "1.3.618"]
                 [org.clojure/tools.logging "1.1.0"]
                 [org.apache.logging.log4j/log4j-api "2.13.3"]
                 [org.apache.logging.log4j/log4j-core "2.13.3"]
                 [org.apache.logging.log4j/log4j-slf4j-impl "2.13.3"]
                 ]
  :main severo-http-connector.core
  :profiles {:dev {:global-vars {*warn-on-reflection* true}
                   :plugins [[cider/cider-nrepl "0.25.4"]]
                   :resource-paths ["resources"
                                    "example-config"
                                    ]
                   :repl-options {:init-ns severo-http-connector.core} 
                   }
             :uberjar {:aot :all
                       }
             } 
  )
