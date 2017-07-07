(ns sandbox.core-test
  (:require [clojure.test :refer :all]
            [sandbox.core :refer :all]))

(def plus #(+ % 3))
(def times #(* % 2))

; 適用順は右から
(def f (comp times plus))
(def g (comp plus times))

; (times (plus 4))
(println (f 4)) ;=> 14
; (plus (times 4))
(println (g 4)) ;=> 11


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest b-test
  (testing "FIXME, I fail."
    (is (= (f 4) 14))))

(deftest c-test
  (testing "FIXME, I fail."
    (is (= (g 4) 11))))
