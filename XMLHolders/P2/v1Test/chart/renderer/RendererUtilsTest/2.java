@Override
            public DomainOrder getDomainOrder() {
                // we're doing this for testing only, and make sure that we
                // only add data in ascending order by x-value
                return DomainOrder.ASCENDING;
            }
        }