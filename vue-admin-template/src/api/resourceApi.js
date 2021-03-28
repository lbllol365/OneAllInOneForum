import fetch from "../config/fetch";

export const getAllResource = data => fetch('/resource/getAll');

export const getResourceByName = data => fetch('/resource/getByName', data, 'POST');

export const getResourceByGetTime = data => fetch('/resource/getByTime', data, "POST");

export const getResouceCount = data => fetch('/resource/getCount');

export const getResourceByType = data => fetch('/resource/getByType', data, 'POST');

export const getResourceTypes = data => fetch('resource/getType');
