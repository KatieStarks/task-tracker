(ns ^:figwheel-no-load task-tracker.app
  (:require [task-tracker.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
