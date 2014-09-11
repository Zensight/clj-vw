;; Copyright (c) 2014 Engagor
;;
;; The use and distribution terms for this software are covered by the
;; BSD License (http://opensource.org/licenses/BSD-2-Clause)
;; which can be found in the file LICENSE at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

(defproject clj-vw "1.0.0-RC1"
  :description "Clojure client and wrapper for vowpal wabbit"
  :url "https://github.com/engagor/clj-vw"
  :license {:name "BSD C2"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :plugins [[cider/cider-nrepl "0.7.0"]
            [codox "0.8.10"]]
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :resource-paths ["resources"])
