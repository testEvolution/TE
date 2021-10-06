@Test
    public void testCloning() {
        StandardXYBarPainter p1 = new StandardXYBarPainter();
        assertFalse(p1 instanceof Cloneable);
        assertFalse(p1 instanceof PublicCloneable);
    }

    