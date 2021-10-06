@Test
    public void testCloning() {
        LineBorder b1 = new LineBorder();
        assertFalse(b1 instanceof Cloneable);
    }

    