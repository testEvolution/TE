@Override
            public DomainOrder getDomainOrder() {
                // we're doing this for testing only, and make sure that we
                // only add data in descending order by x-value
                return DomainOrder.DESCENDING;
            }
        }