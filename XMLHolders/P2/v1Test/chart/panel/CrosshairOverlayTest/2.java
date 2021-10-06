@Test
    public void testCloning() throws CloneNotSupportedException {
        CrosshairOverlay o1 = new CrosshairOverlay();
        o1.addDomainCrosshair(new Crosshair(99.9));
        o1.addRangeCrosshair(new Crosshair(1.23, new GradientPaint(1.0f, 2.0f,
                Color.RED, 3.0f, 4.0f, Color.BLUE), new BasicStroke(1.1f)));
        CrosshairOverlay o2 = (CrosshairOverlay) o1.clone();
        assertTrue(o1 != o2);
        assertTrue(o1.getClass() == o2.getClass());
        assertTrue(o1.equals(o2));

        o1.addDomainCrosshair(new Crosshair(3.21));
        o1.addRangeCrosshair(new Crosshair(4.32));
        assertFalse(o1.equals(o2));
    }

}