#!/bin/sh -eu

case "$1" in
  "idle" ) exec tail -f /dev/null ;;
  "run" ) lein run ;;
  "test" ) lein test ;;
esac

exec "$@"
