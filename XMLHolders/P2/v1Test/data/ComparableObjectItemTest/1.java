@Test
    public void testEquals() {
        ComparableObjectItem item1 = new ComparableObjectItem(1, "XYZ");
        ComparableObjectItem item2 = new ComparableObjectItem(1, "XYZ");
        assertEquals(item1, item2);

        item1 = new ComparableObjectItem(2, "XYZ");
        assertNotEquals(item1, item2);
        item2 = new ComparableObjectItem(2, "XYZ");
        assertEquals(item1, item2);

        item1 = new ComparableObjectItem(2, null);
        assertNotEquals(item1, item2);
        item2 = new ComparableObjectItem(2, null);
        assertEquals(item1, item2);
    }

    