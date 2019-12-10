(ns babashka.impl.java-time
  {:no-doc true}
  (:require [java-time :as jt]))

(def java-time-core-namespace
  {'local-time jt/local-time
   'time-between jt/time-between})
