@Test
    public void testCloning() {
        GradientBarPainter p1 = new GradientBarPainter(0.1, 0.2, 0.3);
        assertFalse(p1 instanceof Cloneable);
        assertFalse(p1 instanceof PublicCloneable);
    }

    