FROM clojure:lein-2.7.1-alpine

WORKDIR /app

# entry point
COPY docker-entrypoint.sh /
ENTRYPOINT ["/docker-entrypoint.sh"]
CMD ["idle"]
