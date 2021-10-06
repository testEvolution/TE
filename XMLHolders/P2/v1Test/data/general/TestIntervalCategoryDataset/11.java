public void setItem(Number value, Number lower, Number upper,
            Comparable rowKey, Comparable columnKey) {
        IntervalDataItem item = new IntervalDataItem(value, lower, upper);
        this.data.addObject(item, rowKey, columnKey);
        fireDatasetChanged();
    }

    