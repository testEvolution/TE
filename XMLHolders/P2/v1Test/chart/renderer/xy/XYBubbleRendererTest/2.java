@Test
    public void testCloning() throws CloneNotSupportedException {
        XYBubbleRenderer r1 = new XYBubbleRenderer();
        XYBubbleRenderer r2 = (XYBubbleRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    