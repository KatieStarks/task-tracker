(ns task-tracker.core-test
  (:require [cljs.test :refer-macros [is are deftest testing use-fixtures]]
            [pjstadig.humane-test-output]
            [task-tracker.core :as rc]))

(deftest test-home
  (is (= true true)))

