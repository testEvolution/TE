@Override
    public int getColumnIndex(Comparable key) {
        // defer null argument check
        return this.data.getColumnIndex(key);
    }

    