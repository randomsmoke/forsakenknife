(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]
            [digitalbird.easterntombstone.nocturnalhelium.core :refer :all]
  )
)

(deftest verifyconfigfile-test-happy11
  (testing "This is a happy path test of verifyconfigfile with one stanza.")
  (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")
)

(deftest verifyconfigfile-test-happy12
  (testing "This is another happy path test of verifyconfigfile with one stanza.")
  (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host1" "Hostname hostname1" "User user1" "IdentityFile keyfile1" "ControlMaster auto" "ControlPath keyfile1_%h_%p_%r")) 0 "host1" "hostname1" "user1" "keyfile1")
)

(deftest verifyconfigfile-test-unhappy-blank1
  (testing "This is an unhappy path test of verifyconfigfile.  There is no blank space at the beginning.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "not blank" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-host1
  (testing "This is an unhappy path test of verifyconfigfile.  The host is wrong.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host2" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-hostname1
  (testing "This is an unhappy path test of verifyconfigfile.  The hostname is wrong.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname2" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-user1
  (testing "This is an unhappy path test of verifyconfigfile.  The user is wrong.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user2" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-identity1
  (testing "This is an unhappy path test of verifyconfigfile.  The identity is wrong.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile2" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-controlmaster1
  (testing "This is an unhappy path test of verifyconfigfile.  The control master is wrong.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile2" "ControlMaster auto2" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-controlpath1
  (testing "This is an unhappy path test of verifyconfigfile.  The control path is wrong.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile2" "ControlMaster auto2" "ControlPath keyfile_%h_%p_%r2")) 0 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-happy21
  (testing "This is a happy path test of verifyconfigfile with two stanzas.")
  (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname2" "User user2" "IdentityFile keyfile2" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r" "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")
)

(deftest verifyconfigfile-test-happy22
  (testing "This is another happy path test of verifyconfigfile with two stanzas.")
  (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host2" "Hostname hostname2" "User user1" "IdentityFile keyfile1" "ControlMaster auto" "ControlPath keyfile1_%h_%p_%r" "" "Host host1" "Hostname hostname1" "User user1" "IdentityFile keyfile1" "ControlMaster auto" "ControlPath keyfile1_%h_%p_%r")) 1 "host1" "hostname1" "user1" "keyfile1")
)

(deftest verifyconfigfile-test-unhappy-blank2
  (testing "This is an unhappy path test of verifyconfigfile.  There is no blank space at the beginning of the second stanza.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r" "not blank" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-host2
  (testing "This is an unhappy path test of verifyconfigfile.  The host is wrong in the second stanza.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r""" "Host host2" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-hostname2
  (testing "This is an unhappy path test of verifyconfigfile.  The hostname is wrong in the second stanza.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname2" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r" "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-user2
  (testing "This is an unhappy path test of verifyconfigfile.  The user is wrong in the second stanza.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r" "" "Host host" "Hostname hostname" "User user2" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-identity2
  (testing "This is an unhappy path test of verifyconfigfile.  The identity is wrong in the second stanza.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile2" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r" "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-controlmaster2
  (testing "This is an unhappy path test of verifyconfigfile.  The control master is wrong in the second stanza.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r" "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto2" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")))
)

(deftest verifyconfigfile-test-unhappy-controlpath2
  (testing "This is an unhappy path test of verifyconfigfile.  The control path is wrong in the second stanza.")
  (is (thrown? RuntimeException (verifyconfigfile (mock-is (new RuntimeException)) (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r2" "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile2" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r2")) 1 "host" "hostname" "user" "keyfile")))
)
