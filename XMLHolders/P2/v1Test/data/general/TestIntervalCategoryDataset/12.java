public void removeItem(Comparable rowKey, Comparable columnKey) {
        this.data.removeObject(rowKey, columnKey);
        fireDatasetChanged();
    }

    