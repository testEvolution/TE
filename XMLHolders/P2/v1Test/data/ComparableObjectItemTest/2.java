@Test
    public void testCloning() throws CloneNotSupportedException {
        ComparableObjectItem item1 = new ComparableObjectItem(1, "XYZ");
        ComparableObjectItem item2 = (ComparableObjectItem) item1.clone();
        assertNotSame(item1, item2);
        assertSame(item1.getClass(), item2.getClass());
        assertEquals(item1, item2);
    }

    