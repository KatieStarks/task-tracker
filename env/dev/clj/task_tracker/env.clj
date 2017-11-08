(ns task-tracker.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [task-tracker.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[task-tracker started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[task-tracker has shut down successfully]=-"))
   :middleware wrap-dev})
