@Test
    public void testCloning() throws CloneNotSupportedException {
        CategoryAxis a1 = new CategoryAxis("Test");
        a1.setAxisLinePaint(Color.RED);
        CategoryAxis a2 = (CategoryAxis) a1.clone();
        assertNotSame(a1, a2);
        assertSame(a1.getClass(), a2.getClass());
        assertEquals(a1, a2);
    }

    