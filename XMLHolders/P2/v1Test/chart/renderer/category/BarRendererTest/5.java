@Test
    public void testEventNotification() {

        RendererChangeDetector detector = new RendererChangeDetector();
        BarRenderer r1 = new BarRenderer();
        r1.addChangeListener(detector);

        detector.setNotified(false);
        r1.setDefaultPaint(Color.RED);
        assertTrue(detector.getNotified());

    }

    