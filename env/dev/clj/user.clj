(ns user
  (:require 
            [mount.core :as mount]
            [task-tracker.figwheel :refer [start-fw stop-fw cljs]]
            task-tracker.core))

(defn start []
  (mount/start-without #'task-tracker.core/repl-server))

(defn stop []
  (mount/stop-except #'task-tracker.core/repl-server))

(defn restart []
  (stop)
  (start))


