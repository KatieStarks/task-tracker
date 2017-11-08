(ns task-tracker.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [task-tracker.core-test]))

(doo-tests 'task-tracker.core-test)

